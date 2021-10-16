import java.util.ArrayList;

public class ADijkstra {
    Status status;
    
    private ArrayList<Vertex> vertex;
    private ArrayList<Integer> costos;
    
    public ADijkstra(){
        this.status = new Status();

        this.vertex = new ArrayList<Vertex>();
    }
    public boolean addVertex(String values){
        boolean statusAdd = false;
        if( this.status.getStatusAlgo() ){
            Vertex verte = this.setVertex(values);            

            this.status.startAlgo();
            this.status.setSizeNodes( verte.getSize() );
            this.vertex.add(verte);
            statusAdd = true;

        }else{
            Vertex verte = this.setVertex(values);

            if(this.status.getSizeNodes() == verte.getSize()){
                this.vertex.add(verte);
                statusAdd = true;
            }else{
                statusAdd = false;
            }
        }
        return statusAdd;
    }
    private Vertex setVertex(String values){
        Vertex verte = new Vertex();
        for ( String cost : values.split(",") ) {
            verte.addVertex( Integer.parseInt(cost) );
        }
        return verte;
    }
    public String getMessageInit(){
        return this.status.startMessage();
    }
    public String getVertex(){
        String adjacencyMatrix = "\n";

        for (Vertex verte: this.vertex) {
            for(int i = 0; i < this.status.getSizeNodes();i++){               
                adjacencyMatrix += String.format("%10s",Integer.toString( verte.getVertex().get(i) )) ;
            }
            adjacencyMatrix += "\n";
        }
        return adjacencyMatrix;
    }
}
