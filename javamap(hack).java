import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }
        int n = scanner.nextInt();
        scanner.nextLine(); 
        Map<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            phoneBook.put(name, phone);
        }
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if (query.isEmpty()) {
                continue;
            }
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
