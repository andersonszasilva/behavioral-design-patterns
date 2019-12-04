package br.com.adesoszasilva.behavioraldesignpatterns.strategy;

public class OperationSubstract implements Strategy{
  
  @Override
   public int doOperation(int numberLeft, int numberRight) {
      return numberLeft - numberRight;
   }
}