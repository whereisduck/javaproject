package OOD.builder;

public class Computer {
    public static void main(String[] args) {
        //initial a Builder and a computer instance inside the builder;
        Computer.Builder builder = Computer.builder();
        Computer computer = builder.setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false)
                .build();

        System.out.println(computer.toString());



    }

    //required parameters
    private String HDD;

    private String RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;


    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }


    public static class Builder {
        private Computer computer;
        //private  Builder builder;
        private Builder() {
            System.out.println("Static Builder Class initial with an computer instance ");
            computer= new Computer();
            //builder = new Builder();
        }

        private Builder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            computer.isGraphicsCardEnabled = graphicsCardEnabled;
            System.out.println("setting GraphicsCard as " + graphicsCardEnabled);
            return this;
        }

        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
           computer.isBluetoothEnabled = bluetoothEnabled;
            System.out.println("setting  Bluetooth as " + bluetoothEnabled);
           return this;
        }
        public Computer build(){
            System.out.println("Static Builder Class built an computer after setting space");
            return computer;
        }


    }

    public static Builder builder(){
        System.out.println("set up a BUILDER class inside Computer Class to built an computer");
        Builder builder= new Builder();
        return builder;


    }

    @Override
    public String toString() {
        return String.format("HDD: %s; RAM: %s; isGraphicsCardEnabled: %s; isBluetoothEnabled: %s", this.getHDD(), this.getRAM(), this.isGraphicsCardEnabled, this.isBluetoothEnabled);

        };

}
