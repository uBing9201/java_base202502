package oop.poly.test;

public class Computer {

    private ComputerPart[] parts;

    public Computer() {
        this.parts = new ComputerPart[0];
    }

    public void addPart(ComputerPart part) {
        // ComputerPart[] 에 부품 추가
        if(part == null) return;

        ComputerPart[] newParts = new ComputerPart[parts.length + 1];

        for(int i = 0; i < parts.length; i++) {
            newParts[i] = parts[i];
        }
//        System.arraycopy(parts, 0, newParts, 0, parts.length);

        newParts[parts.length] = part;

        parts = newParts;


    }

    public void showParts() {
        // 모든 부품 정보 출력
        if (parts.length == 0) {
            System.out.println("부품이 없습니다.");
            return;
        }

        for (ComputerPart part : parts) {
            part.describePart();  // 각 부품의 describePart() 호출
        }
    }

}
