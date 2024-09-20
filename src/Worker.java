public class Worker {
    private String name;
    private int baseSalary;
    private int complement;
    private int totalSalary;
    private static int totalCompanySalary;

    // Default constructor
    public Worker() {
        this.name = "";
        this.baseSalary = 0;
        this.complement = 0;
        this.totalSalary = calculateTotalSalary();
        totalCompanySalary += totalSalary;
    }

    // Parameterized constructor
    public Worker(String name, int baseSalary, int complement) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.complement = complement;
        this.totalSalary = calculateTotalSalary();
        totalCompanySalary += totalSalary;
    }

    // Calculate the total salary
    public int calculateTotalSalary() {
        return baseSalary + complement;
    }

    // Get complete details of worker
    public void getDetails() {
        System.out.println("Worker Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Complement: " + complement);
        System.out.println("Total Salary: " + totalSalary);
    }

    // Getter and setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
        totalCompanySalary -= totalSalary;
        // Recalculate after change
        this.totalSalary = calculateTotalSalary();
        totalCompanySalary += totalSalary;
    }

    public int getComplement() {
        return complement;
    }

    public void setComplement(int complement) {
        this.complement = complement;
        totalCompanySalary -= totalSalary;
        // Recalculate after change
        this.totalSalary = calculateTotalSalary();
        totalCompanySalary += totalSalary;
    }

    public int getTotalSalary() {
        return this.totalSalary;
    }

    public static int getTotalCompanySalary() {
        return totalCompanySalary;
    }
}