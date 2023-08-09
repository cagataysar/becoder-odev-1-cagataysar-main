public class SmartPhone extends Phone{

    public int storage;

    public int ram;

    public int camera;

    public SmartPhone (Integer id, String name, Double price, Integer phoneNumber,int storage,int ram,int camera) {
        super(id, name, price, phoneNumber);
        this.storage=storage;
        this.ram=ram;
        this.camera=camera;
    }

    public int getStorage () {
        return storage;
    }

    public void setStorage (int storage) {
        this.storage = storage;
    }

    public int getRam () {
        return ram;
    }

    public void setRam (int ram) {
        this.ram = ram;
    }

    public int getCamera () {
        return camera;
    }

    public void setCamera (int camera) {
        this.camera = camera;
    }
}
