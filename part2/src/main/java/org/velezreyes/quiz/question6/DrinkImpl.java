package org.velezreyes.quiz.question6;

public class DrinkImpl implements Drink{

    private String name;
    private boolean isFizzy;
    private int price;

    public DrinkImpl(String name, boolean isFizzy, int price) {
        this.name = name;
        this.isFizzy = isFizzy;
        this.price = price;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean isFizzy() {
        return this.isFizzy;
    }

    public void setFizzy(boolean fizzy) {
        this.isFizzy = fizzy;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
