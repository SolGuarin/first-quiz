package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  private int amountTotal = 0;

  private static VendingMachineImpl single_instance;

  public static VendingMachineImpl getInstance() {
    if (single_instance == null)
      single_instance = new VendingMachineImpl();

    return single_instance;
  }

  @Override
  public void insertQuarter() {
    this.amountTotal += 25;
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {

    DrinkImpl drink = null;

    if (this.amountTotal < 75 && name.equals("ScottCola")){
      throw new NotEnoughMoneyException();
    } else if (this.amountTotal < 100 && name.equals("KarenTea")){
      throw new NotEnoughMoneyException();
    }

    if (name.equals("ScottCola")){
      drink = new DrinkImpl("ScottCola", true, 75);
      this.amountTotal -= 75;
    } else if (this.amountTotal >= 100 && name.equals("KarenTea")){
      drink = new DrinkImpl("KarenTea", false, 100);
      this.amountTotal -= 100;
    }

    if (name.equals("BessieBooze")){
      throw new UnknownDrinkException();
    }
    return drink;
  }
}
