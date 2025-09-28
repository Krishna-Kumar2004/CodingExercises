package FacadePattern;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        disk.read();
        System.out.println("Computer started successfully!");
    }
}

