package intArrays;

/**
 * Defines the interface for classes that generate arrays of ints
 * <p>
 * The constructor for implementations of this class should generate an array 
 * of ints
 * <p>
 * <i>This is an interface, and specifies the signature(s) of method(s) that
 * you should implement in (a) <b>separate</b> class(es).  You should <b>not</b> edit
 * this class! 
 * 
 * @author Hugh Osborne
 * @version September 2016
 */

public interface Array
{
    /**
     * @return the array of ints generated by this ArrayGenerator
     */
    public int[] getArray();
}