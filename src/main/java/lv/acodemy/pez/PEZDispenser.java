package lv.acodemy.pez;

public class PEZDispenser {
    private final String name;  
    private final String model;
    private final String color;
    public Integer candyAmount;

    @Override
    public String toString() {
        return "PEZDispenser{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", candyAmount=" + candyAmount +
                '}';
    }

    public PEZDispenser(String name, String model, String color) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.candyAmount = 12;
    }

    public Integer checkAndChangeAmount(int changeAmount) {
        // ()-the number from the terminal will be inserted into brackets
        var newAmount = this.candyAmount + changeAmount;
        if (newAmount > 12) {
            System.out.println("It is not possible to put more than 12 candies.");
            System.out.println("Please try again.");
        } else if (newAmount < 0) {
            System.out.println("It is not possible to get more candies than there are in the dispenser.");
            System.out.println("Please try again.");
        } else {
            System.out.println("The amount of candies in the dispenser has been successfully changed.");
            this.candyAmount = newAmount;
        }
        return candyAmount;
    }

    public Integer putOne() {
        return checkAndChangeAmount(1);
    }

    public Integer getOne() {
        return checkAndChangeAmount(-1);
    }

    public Integer putMore(int howMuch) {
        return checkAndChangeAmount(howMuch);
    }
   

    public Integer getMore(int howMuch) {
        return checkAndChangeAmount(-howMuch);
    }
    

    public void starDisplay() {
        System.out.println("Current candy amount is: "+ candyAmount);
        System.out.println(" _");
        for (int i = 0; i < candyAmount; i++) {
            System.out.println("|*|");
        }
        System.out.println(" -");

    }
}





