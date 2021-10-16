public class Status {
    private boolean statusAlgo;
    private int sizeNodes;

    private String ok_message = "+ [OK]";
    private String help = " [?] Ingrese la matriz de adyacencia por filas, los valores separados por ',' ";

    public Status(){
        this.statusAlgo = true;
    }

    public String startMessage(){
        return "Algoritmo de Dijkstra \n" + this.help;
    }
    public String getAdjacencyMatrixExample(){
        String head = String.format("\n %c %c %c %c %c",'/', 'A','B','C','D');
        return head;
    }
    public void startAlgo(){
        this.statusAlgo = false;
        this.sizeNodes = 0;
    }
    public void resetAlgo(){
        this.statusAlgo = true;
        this.sizeNodes = 0;
    }
    public boolean getStatusAlgo(){
        return this.statusAlgo;
    }
    public void setSizeNodes(int size){
        this.sizeNodes = size;
    }
    public int getSizeNodes(){
        return this.sizeNodes;
    }
}
