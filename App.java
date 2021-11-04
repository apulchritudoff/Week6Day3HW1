public class App {
    public static void main(String[] args) throws Exception {

     


        Pet frog1 = new Pet();
        frog1.setName("Fred");
        frog1.setAge(5);

        System.out.println(frog1.getName());
        System.out.println(frog1.getAge());


    }
}

class Pet {
    private String name;
    private int age;
    private String location;
    private String type;

    // Constructor for Pet
    public Pet(String name, int age, String location, String type) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;
    }
    // constructor for no parameters
    public Pet() {
        this.name = "";
        this.age = 0;
        this.location = "";
        this.type = "";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // toString method
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}

class Computer {
    private String cpu;
    private String ram;
    private String hdd;
    private String gpu;

    // Constructor for Computer
    public Computer(String cpu, String ram, String hdd, String gpu) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.gpu = gpu;
    }

    // constructor for cpu and gpu
    public Computer(String cpu, String gpu) {
        this.cpu = cpu;
        this.gpu = gpu;
    }

    // constructor for no parameters
    public Computer() {
        this.cpu = "";
        this.ram = "";
        this.hdd = "";
        this.gpu = "";
    }

    // Getters and Setters
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHdd() {
        return hdd;
    }

    public void setHdd(String hdd) {
        this.hdd = hdd;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    // toString method
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", hdd='" + hdd + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    // check to see if the computer has a gpu method
    public boolean hasGpu() {
        if (this.gpu.equals("")) {
            return false;
        } else {
            return true;
        }
    }

}
/*
class Frog {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
*/