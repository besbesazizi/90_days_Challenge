package factory;

public abstract class OperationSystem {
    String version ;
    String architecture;
    public OperationSystem(String version, String architecture) {
        this.version = version;
        this.architecture = architecture;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public OperationSystem() {
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getVersion() {
        return version;
    }

    public String getArchitecture() {
        return architecture;
    }
        public abstract void changeDir(String dir );
        public abstract void removeDir(String dir );

}
