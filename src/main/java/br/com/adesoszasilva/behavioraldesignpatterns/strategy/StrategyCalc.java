package br.com.adesoszasilva.behavioraldesignpatterns.strategy;

public class StrategyCalc {
   private Strategy strategy;

   public StrategyCalc(Strategy strategy){
      this.strategy = strategy;
   }

   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}