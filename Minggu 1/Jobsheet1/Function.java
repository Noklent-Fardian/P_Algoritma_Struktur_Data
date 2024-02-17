package Jobsheet1;

public class Function {
    static int[][] stock = {
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 } };

        public static void main(String[] args) {
            System.out.println("=========================================");
            System.out.println("Toko Bunga Shadow Garden");
            System.out.println("=========================================");

            String firstLine = "╔═══════════════════════╦══════════╦══════════╦══════════╦══════════╗";
            String middleLine = "╠═══════════════════════╬══════════╬══════════╬══════════╬══════════╣";
            String lastLine = "╚═══════════════════════╩══════════╩══════════╩══════════╩══════════╝";
            String formatTable = "║ %-21s ║  %-7s ║  %-7s ║ %-7s  ║ %-7s  ║%n";
            System.out.println(firstLine);
            System.out
                    .println("║ Cabang Shadow Garden  ║ Aglonema ║  Keladi  ║ Alocasia ║ Mawardah ║");
            System.out.println(middleLine);
            for (int i = 0; i < stock.length; i++) {
                System.out.format(formatTable, "Shadow Garden " + (i + 1), stock[i][0], stock[i][1], stock[i][2],
                        stock[i][3]);
                if (i < stock.length - 1) {
                    System.out.println(middleLine);
                }
            }

        
            System.out.println(lastLine);
            return;
        }
    
}
