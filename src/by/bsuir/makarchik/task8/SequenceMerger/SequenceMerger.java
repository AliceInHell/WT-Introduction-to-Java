package by.bsuir.makarchik.task8.SequenceMerger;

public class SequenceMerger {
    public static double[] merge(double[] a, double[] b){
        double[] mergedSequence = new double[a.length + b.length];
        int indexA = 0, indexB = 0;
        int currentIndex = 0;
        while(indexA != a.length && indexB != b.length){
            if(a[indexA] <= b[indexB]){
                if(a[indexA] == b[indexB])
                    indexB++;
                mergedSequence[currentIndex++] = a[indexA++];
            }
            else{
                if(indexA + 1 != a.length) {
                    if (a[indexA + 1] > b[indexB]) {
                        mergedSequence[currentIndex++] = b[indexB];
                        System.out.print(b[indexB++] + " new index  -  " + (currentIndex - 1) + "\n");
                    }
                }
                else{
                    mergedSequence[currentIndex++] = a[indexA++];
                }
            }
        }

        if(indexA == a.length){
            while(indexB != b.length && b[indexB] > a[a.length - 1]){
                mergedSequence[currentIndex++] = b[indexB];
                System.out.print(b[indexB++] + " new index  -  " + (currentIndex - 1) + "\n");
            }

        }
        else
            if(indexB == b.length){
                while(indexA != a.length){
                    mergedSequence[currentIndex++] = a[indexA++];
                }

            }
        double[] resultSequence = new double[currentIndex];
        System.arraycopy(mergedSequence, 0, resultSequence, 0, currentIndex);
        return resultSequence;
    }
}
