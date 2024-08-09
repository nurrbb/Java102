import java.util.*;
public class Store {

    private final ArrayList<Brand> brands = new ArrayList<>();
    private ArrayList<Phone> phones = new ArrayList<>();
    private ArrayList<Notebook> notebooks = new ArrayList<>();
    private int productIdCounter = 1;
   public Store(){
       initializeBrands();
       initializePhones();
       initializeNotebooks();
   }
    private void initializeBrands() {
        brands.add(new Brand(1, "Apple"));
        brands.add(new Brand(2, "Asus"));
        brands.add(new Brand(3, "Casper"));
        brands.add(new Brand(4, "HP"));
        brands.add(new Brand(5, "Huawei"));
        brands.add(new Brand(6, "Lenovo"));
        brands.add(new Brand(7, "Monster"));
        brands.add(new Brand(8, "Samsung"));
        brands.add(new Brand(9, "Xiaomi"));

        brands.sort(Comparator.comparing(Brand::getName));
    }

    public void  initializePhones(){
       phones.add(new Phone(productIdCounter++,brands.get(0),"IPhone 13",40000.0,0,23,128,6.1,3000,4,"White"));
       phones.add(new Phone(productIdCounter++,brands.get(0),"IPhone 15",50600.0,0,54,128,6.1,4000,6,"Black"));
       phones.add(new Phone(productIdCounter++,brands.get(7),"Galaxy S24 Ultra",60000.0,0,43,512,6.8,5000,12,"Black"));
       phones.add(new Phone(productIdCounter++,brands.get(7),"Galaxy S22",18300.0,0,14,128,6.1,3700,8,"White"));
       phones.add(new Phone(productIdCounter++,brands.get(8),"Redmi Note 13 Pro",13700.0,0,13,256,6.6,5000,8,"White"));
       phones.add(new Phone(productIdCounter++,brands.get(8),"Redmi Note 12",7400.0,0,13,128,6.8,5000,8,"Black"));
       phones.add(new Phone(productIdCounter++,brands.get(8),"Redmi Note 10",11900.0,0,13,128,6.6,5000,8,"Blue"));
       phones.add(new Phone(productIdCounter++,brands.get(4),"Nora 12S",20100.0,0,13,128,6.7,4500,8,"Blue"));
       phones.add(new Phone(productIdCounter++,brands.get(4),"Mate Xs",48000.0,0,13,512,6.6,4500,8,"Blue"));
    }

    public void initializeNotebooks(){
       notebooks.add(new Notebook(productIdCounter++,brands.get(0),"Macbook Air",35000.0,0,10,16,256,13));
       notebooks.add(new Notebook(productIdCounter++,brands.get(0),"Macbook Pro",91900.0,0,10,18,512,14));
       notebooks.add(new Notebook(productIdCounter++,brands.get(5),"IdeaPad 3",18000.0,0,10,8,512,15));
       notebooks.add(new Notebook(productIdCounter++,brands.get(5),"IdeaPad Gaming 3",64000.0,0,10,8,256,15));
       notebooks.add(new Notebook(productIdCounter++,brands.get(4),"Matebook D16",20000.0,0,10,8,512,16));
       notebooks.add(new Notebook(productIdCounter++,brands.get(2),"Excalibur",39100.0,0,10,32,512,15));
       notebooks.add(new Notebook(productIdCounter++,brands.get(2),"Nirvana C550",20100.0,0,10,16,512,15));
       notebooks.add(new Notebook(productIdCounter++,brands.get(1),"TUf Gaming",25100.0,0,10,8,512,15));
       notebooks.add(new Notebook(productIdCounter++,brands.get(1),"Vivobook",47500.0,0,10,8,512,15));
       notebooks.add(new Notebook(productIdCounter++,brands.get(7),"Abra A5",39900.0,0,10,32,512,15));
    }
    private void listBrands(){
        System.out.println("Brands\n-----------------------");
        for (Brand brand: brands){
            System.out.printf("| %-2d | %-10s |\n", brand.getId(), brand.getName());
        }
    }
    private void listPhones() {
        System.out.println("\nPhone List");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Brand    | Product Name            | Price        | Memory | Screen  | Battery | RAM |  Color   |");
        System.out.println("--------------------------------------------------------------------------------------------------------");
        for (Phone phone : phones) {
            System.out.printf("| %-2d | %-7s | %-24s | %-9.2f TL | %-6d | %-7.1f | %-7d | %-4d | %-7s |\n",
                    phone.getId(), phone.getBrand().getName(), phone.getName(),
                    phone.getPrice(), phone.getMemory(), phone.getScreenSize(), phone.getBattery(),
                    phone.getRam(), phone.getColor());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------");
    }

    private void listNotebooks() {
        System.out.println("\nNotebook List");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("| ID | Brand   | Product Name        | Price         | RAM | Storage |  Screen Size  |");
        System.out.println("--------------------------------------------------------------------------------------");
        for (Notebook notebook : notebooks) {
            System.out.printf("| %2d | %-7s | %-19s | %10.2f TL | %3d | %6d  | %6.1f inches |\n",
                    notebook.getId(),
                    notebook.getBrand().getName(),
                    notebook.getName(),
                    notebook.getPrice(),
                    notebook.getRam(),
                    notebook.getStorage(),
                    notebook.getScreenSize());
        }
        System.out.println("--------------------------------------------------------------------------------------");
    }
    private void removePhoneById(int id) {
        phones.removeIf(phone -> phone.getId() == id);
        System.out.println("Phone removed.");
    }

    private void removeNotebookById(int id) {
        notebooks.removeIf(notebook -> notebook.getId() == id);
        System.out.println("Notebook removed.");
    }
    private void filterPhonesByBrand(int brandId) {
        boolean found = false;
        for (Phone phone : phones) {
            if (phone.getBrand().getId() == brandId) {
                System.out.println(phone);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products available under the selected brand.");
        }
    }


    private void filterNotebooksByBrand(int brandId) {
        boolean found = false;
        for (Notebook notebook : notebooks) {
            if (notebook.getBrand().getId() == brandId) {
                System.out.println(notebook);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products available under the selected brand.");
        }
    }


    private void  addNotebook(Scanner scanner){

        listBrands();
        System.out.println("Enter Brand Id:");
        int brandId =scanner.nextInt();

        System.out.println("Product name:");
        scanner.nextLine();
        String name =scanner.nextLine();

        System.out.println("Price:");
        double price = scanner.nextDouble();

        System.out.print("Discount Rate (0-100): ");
        double discountRate = scanner.nextDouble();

        System.out.print("Stock Amount: ");
        int stock = scanner.nextInt();

        System.out.print("RAM: ");
        int ram = scanner.nextInt();

        System.out.print("Storage: ");
        int storage = scanner.nextInt();

        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();

        notebooks.add(new Notebook(productIdCounter++,brands.get(brandId-1),name,price,discountRate,stock,ram,storage,screenSize));
        System.out.println("Notebook added!");
    }

    private void  addPhone(Scanner scanner){

        listBrands();
        System.out.println("Enter Brand Id:");
        int brandId =scanner.nextInt();

        System.out.println("Product name:");
        scanner.nextLine();
        String name =scanner.nextLine();

        System.out.println("Price:");
        double price = scanner.nextDouble();

        System.out.print("Discount Rate (0-100): ");
        double discountRate = scanner.nextDouble();

        System.out.print("Stock Amount: ");
        int stock = scanner.nextInt();

        System.out.print("Memory: ");
        int memory = scanner.nextInt();

        System.out.print("Screen Size: ");
        double screenSize = scanner.nextDouble();

        System.out.println("Battery: ");
        int battery = scanner.nextInt();

        System.out.println("RAM:");
        int ram = scanner.nextInt();

        System.out.println("Colour:");
        scanner.nextLine();
        String colour =scanner.nextLine();

        phones.add(new Phone(productIdCounter++,brands.get(brandId-1),name,price,discountRate,stock,memory,screenSize,battery,ram,colour));
        System.out.println("Phone added!");
    }
    public void notebookMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nNotebook Operations Menu");
            System.out.println("1. List Notebooks");
            System.out.println("2. Filter Notebooks by Brand");
            System.out.println("3. Add Notebook");
            System.out.println("4. Remove Notebook by ID");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    listNotebooks();
                    break;
                case 2:
                    listBrands();
                    System.out.print("Enter Brand Id: ");
                    int notebookBrandId = scanner.nextInt();
                    filterNotebooksByBrand(notebookBrandId);
                    break;
                case 3:
                    addNotebook(scanner);
                    break;
                case 4:
                    listNotebooks();
                    System.out.print("Enter Notebook ID to remove: ");
                    int notebookId = scanner.nextInt();
                    removeNotebookById(notebookId);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }

    public void phoneMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nPhone Operations Menu");
            System.out.println("1. List Phones");
            System.out.println("2. Filter Phones by Brand");
            System.out.println("3. Add Phone");
            System.out.println("4. Remove Phone by ID");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    listPhones();
                    break;
                case 2:
                    listBrands();
                    System.out.print("Enter Brand Id: ");
                    int phoneBrandId = scanner.nextInt();
                    filterPhonesByBrand(phoneBrandId);
                    break;
                case 3:
                    addPhone(scanner);
                    break;
                case 4:
                    listPhones();
                    System.out.print("Enter Phone ID to remove: ");
                    int phoneId = scanner.nextInt();
                    removePhoneById(phoneId);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
    public void mainMenu(Scanner scanner) {
        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Notebook Operations");
            System.out.println("2. Phone Operations");
            System.out.println("3. List Brands");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    notebookMenu(scanner);
                    break;
                case 2:
                    phoneMenu(scanner);
                    break;
                case 3:
                    listBrands();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
