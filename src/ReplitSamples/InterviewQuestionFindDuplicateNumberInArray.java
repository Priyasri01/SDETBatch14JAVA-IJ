package ReplitSamples;

public class InterviewQuestionFindDuplicateNumberInArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,2,7,8,8,3};

      int dupNum  =duplicateValue(arr);

        System.out.println(dupNum);


    }

    public static int duplicateValue(int[] num){

        int count=0;

        for(int i=0; i<num.length;i++){

            for(int j=i+1; i< num.length;j++){

                if(num[i]==num[j]){

                    count++;
                }
            }
        }



        return count;
    }

}
