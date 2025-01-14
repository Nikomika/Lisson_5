import java.util.Arrays;

public class TwoArray {
    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int summ = 0;
        int value;
        int row;
        int cell;

        if(array.length != 4 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i=1;i<5;i++){
            row = i;
            for(int c=1;c<5;c++){
                cell = c;
                try{
                    value = Integer.parseInt(array[i-1][c-1]);
                    summ += value;
                } catch (IllegalArgumentException e){
                    String message = "в "+row+" ряду, "+cell+" ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return summ;
    }
}

