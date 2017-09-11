package pe.hyiafactory.gamecore.project_a1;

public class GraphicEngine{

    private GraphicEngine instance = null;

    public GraphicEngine getInstance() {
        if(instance == null){
            instance = new GraphicEngine();
        }
        return instance;
    }

    private GraphicEngine(){

    }
}