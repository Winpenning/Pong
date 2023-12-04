public class Context{
    private Strategy strategy;

    void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }
    void executeStrategy(){
        strategy.executeMusic();
    }
}