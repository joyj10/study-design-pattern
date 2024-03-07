package behavioral.visitor.doc;

import behavioral.visitor.doc.visitor.Visitor;

public class ImageElement implements DocumentElement {
    private String imageUrl;

    public ImageElement(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
