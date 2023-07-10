// 1) Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

package homework.homework2;

import java.io.FileReader;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Write your name, country, city or age: ");
        String where = in.nextLine();
        in.close();
        searchWhere(where);
    }

    public static StringBuilder openFile() {
        StringBuilder data = new StringBuilder();
        try (FileReader fr = new FileReader("homework\\homework2\\task1.json")) {
            int a;
            while ((a = fr.read()) != -1) {
                if ((char)a == '[' || (char)a == ']') {
                    continue;
                }
                else {
                    // заполняем наш StringBuilder данные из файла в переменную retrurn file
                    data.append(Character.toString(a));
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return data;
    }

    public static void searchWhere(String search) {
        String data = openFile().toString();
        String[] arr = data.split("},");
        for (String string : arr) {
            boolean checkNull = string.contains("null");
            if (string.contains(search) && checkNull == false) {
                System.out.println(string);

            }
        }
    }

}
