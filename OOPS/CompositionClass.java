package OOPS;
class GraphicsCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicsCard() {
        this.brand = "Nvidia";
        this.series = 940;
        this.memory = "2 GB";
    }

    public GraphicsCard(String brand, int series, String memory) {

        this.brand = brand;
        this.series = series;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "GraphicsCard [brand=" + brand + ", series=" + series + ", memory=" + memory + "]";
    }

}

class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String minFrequency;
    private String maxfrequency;

    public Processor() {
        this.brand = "intel";
        this.series = "i5 7200u";
        this.generation = 7;
        this.cores = 2;
        this.threads = 4;
        this.cacheMemory = "3MB";
        this.frequency = "2.5Ghz";
        this.minFrequency = "2.5Ghz";
        this.maxfrequency = "3.1Ghz";

    }

    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
                     String frequency, String minFrequency, String maxfrequency) {

        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minFrequency = minFrequency;
        this.maxfrequency = maxfrequency;
    }

    @Override
    public String toString() {
        return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
                + ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
                + ", minFrequency=" + minFrequency + ", maxfrequency=" + maxfrequency + "]";
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinFrequency() {
        return minFrequency;
    }

    public String getMaxfrequency() {
        return maxfrequency;
    }


}


class Laptop{
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyboard;

    Laptop(){
        this.screen = 15.6f;
        this.processor = new Processor();
        this.ram = "DDR4";
        this.hardDrive = "2TB";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "MLT layer";
        this.keyboard = "backlit";

    }

    Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
           String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }
        public String toString() {
            return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
                    + ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
        }

        public Processor getProcessor() {
            return processor;
        }

        public float getScreen() {
            return screen;
        }

        public String getRam() {
            return ram;
        }

        public String getHardDrive() {
            return hardDrive;
        }

        public GraphicsCard getGraphicsCard() {
            return graphicsCard;
        }

        public String getOpticalDrive() {
            return opticalDrive;
        }

        public String getKeyboard() {
            return keyboard;
        }



    }


public class CompositionClass {

    public static void main(String args[]){
        Laptop l = new Laptop();
        System.out.println(l.getGraphicsCard());
    }
}
