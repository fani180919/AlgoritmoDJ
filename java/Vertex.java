import java.util.ArrayList;

public class Vertex {
    private ArrayList<Integer> values;
    
    public Vertex(){
        this.values = new ArrayList<Integer>();
    }

    public void addVertex(int value){
        this.values.add(value);
    }

    public void setVertex(ArrayList<Integer> values){
        this.values = values;
    }
    public ArrayList<Integer> getVertex(){
        return this.values;
    }
    public int getSize(){
        return this.values.size();
    }

}
