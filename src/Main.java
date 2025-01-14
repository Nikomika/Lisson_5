public class Main {
    public static void main(String[] args) {
        int result = 0;

        String[][] validArray = {
                {"78", "1", "43", "18"}, {"0", "6", "43", "11"}, {"9", "1", "5", "17"}, {"34", "2", "3", "37"}
        }; // корректный массив
        String[][] invalidArray = {{"a", "b", "c", "d"}, {"e", "f", "g", "h"}, {"i", "j", "k", "l"}}; // не корректный массив
        String[][] invalidArrayData = {
                {"78", "1", "43", "7"}, {"78", "1", "43", "17"}, {"78", "1", "4ju3", "17"}, {"7hh8", "1", "43", "17"}
        }; // корректный массив
        try {
            result = TwoArray.analyze(validArray); //корректнная работа
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма элементов массива равна "+String.valueOf(result));
        }

        try {
            TwoArray.analyze(invalidArray); // ошибка в размере
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        }

        try {
            TwoArray.analyze(invalidArrayData); // ошибка при преобразовании данных
        } catch(MyArraySizeException e){
            System.out.println(e.getMessage());
        } catch(MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }
}

