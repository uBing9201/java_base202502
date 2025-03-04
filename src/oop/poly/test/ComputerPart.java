package oop.poly.test;

public class ComputerPart {

    // 부품 이름
    protected String partName;
    // 부품 가격
    protected int partPrice;

    public ComputerPart(String partName, int partPrice) {
        this.partName = partName;
        this.partPrice = partPrice;
    }

    // 부품 이름과 가격을 출력합니다.
    public void describePart() {
        System.out.println("Part: " + partName + ", Price: " + partPrice);
    }

}
