package za.ac.cput.za.ac.cput.adpassignmentgroup;

/**
 * This is a simple Branch program
 * @author: Siyanda Hlongwa 217091229
 *
 */
public class Branch {
    private String branchNumber, name;

    public String getBranchNumber() {
        return branchNumber;
    }

    public void setBranchNumber(String branchNumber) {
        this.branchNumber = branchNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchNumber='" + branchNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
