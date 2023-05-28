package uz.pdp.entity.server.model;
public  abstract class BaseModel {
    protected final String id;
    protected boolean deleted;
    static int counter;

    static {
        counter = 0;
    }
    {
        id = String.valueOf(++counter);
    }

    public String getId() {
        return id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
