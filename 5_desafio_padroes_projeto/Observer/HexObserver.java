public class HexObserver implements Observer {
    private Subject subject;
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
}
@Override
public void update() {
    System.out.println("Hex String: " + Integer.toHexString(subject.getState()));
}     

}