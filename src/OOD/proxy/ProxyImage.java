package OOD.proxy;

public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // check the private field Image object
        // belong to this Proxy class is existed or not
        if(realImage ==null){
            //load and display image
            realImage = new RealImage(fileName);
        }
        //just display image
        realImage.display();

    }
}
