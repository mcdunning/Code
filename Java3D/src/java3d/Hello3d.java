package java3d;

import com.sun.j3d.utils.geometry.ColorCube;
import com.sun.j3d.utils.universe.SimpleUniverse;
import javax.media.j3d.BranchGroup;


/**
 * My first Java 3D implementation.  This is a tutorial that was found at 
 * http://www.java3d.org/starting.html
 * 
 * @author Matt Dunning
 */
public class Hello3d 
{
    public Hello3d()
    {
        SimpleUniverse universe = new SimpleUniverse();
        BranchGroup group = new BranchGroup();
        group.addChild( new ColorCube( 0.3 ) );
        universe.getViewingPlatform().setNominalViewingTransform();
        universe.addBranchGraph( group );
    }
}
