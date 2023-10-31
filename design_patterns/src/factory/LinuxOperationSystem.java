package factory;

public class LinuxOperationSystem extends OperationSystem{
    public LinuxOperationSystem(String version, String architecture) {
        super(version, architecture);
    }

    @Override
    public void changeDir(String dir) {

    }

    @Override
    public void removeDir(String dir) {

    }
}
