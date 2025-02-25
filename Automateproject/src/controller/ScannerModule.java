package controller;

public abstract class ScannerModule {
    protected TargetSystem target;

    public ScannerModule(TargetSystem target) {
        this.target = target;
    }

    public abstract String scan();
}
