package j2html.tags;

/**
 * Created by marek on 19/01/16.
 */
public abstract class Renderable {

    public abstract String render();

    @Override
    public String toString() {
        return this.render();
    }

}
