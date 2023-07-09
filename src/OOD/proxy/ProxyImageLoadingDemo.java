package OOD.proxy;

public class ProxyImageLoadingDemo {
    public static void main(String[] args) {
        //call proxy to handle real image loading and display.
        //to achieve caching function.
        Image image = new ProxyImage("Test_10mb.jpg");
        //testing with two loading:
        //1: image will be loaded from disk;
        image.display();
        System.out.println("");

        //2: image will not be loaded from disk;
        image.display();

    }
}

/*
1 :create a interface Image with display method
2: create realImage and ProxyImage
1)create realImage with loading method and override the display
public class RealImage implements Image {

    private String fileName;
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);

    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);

    }
}
2)create  ProxyImage with loading method and override the display
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

 */
