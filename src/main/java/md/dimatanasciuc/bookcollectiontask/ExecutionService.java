package md.dimatanasciuc.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
        Book dimaBook = new Book("Tata bogat tata sarac", "Robert Kyosaki");
        Book denisBook = new Book("Biblia", "Isus)");
        Book altBook = new Book("Atomic habits", "James C.");
        Book altbook1 = new Book("1984", "George O.");
        Book altBook2 = new Book("Crime and Punishment", "Feodor D.");

        dimaBook.printTheBookDetails();
        denisBook.printTheBookDetails();
        altbook1.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(dimaBook);
        carturestiLibrary.addBook(dimaBook);
        carturestiLibrary.addBook(denisBook);
        carturestiLibrary.addBook(altBook2);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isTheSuchABookInTheStock(altBook));

        carturestiLibrary.addBook(altBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        System.out.println(carturestiLibrary.isTheSuchABookInTheStock(altBook));
        carturestiLibrary.deleteABookIfExist(dimaBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBooks();

        Library dimaLibrary = new Library("TAna");
        dimaLibrary.addBook(dimaBook);
        dimaLibrary.addBook(denisBook);
        dimaLibrary.addBook(altBook2);
        System.out.println(dimaLibrary.getTheStockStatusNumber());
        dimaLibrary.printAllTheBooks();

        Map<String, Library> librariesMap = new HashMap<>();
        librariesMap.put("Eminescu 20", carturestiLibrary);
        librariesMap.put("Nationala 32", dimaLibrary);

        System.out.println(librariesMap.get("Eminescu 20").getLibraryName());
        System.out.println(librariesMap.get("Nationala 32").getLibraryName());

        System.out.println(librariesMap.size());


        librariesMap.get("Eminescu 20").printAllTheBooks();
        System.out.println(librariesMap.get("Nationala 32").isTheSuchABookInTheStock(dimaBook));
    int[] dataTable = new int[6];
    dataTable[0] = 9;
    dataTable[1] = 65;
    dataTable[2] = 12;
    dataTable[3] = 52;
    dataTable[4] = 5;
    dataTable[5] = 1;

        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));

        int[] dataTableShort = {3, 6, 5, 2, 4, 7, 4564, 35, 56, 1};

        System.out.println(IntNumberArrayService.findMin(dataTableShort));
        System.out.println(IntNumberArrayService.getAvg(dataTableShort));



    }
}
