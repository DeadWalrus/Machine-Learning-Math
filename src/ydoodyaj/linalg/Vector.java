package ydoodyaj.linalg;

public interface Vector {
    // Add two vectors together
    void add(Vector v);

    // Subtract vector v from this vector
    void subtract(Vector v);

    // Divide each element from this vector by each element in vector v
    void elementDivide(Vector v);

    // Multiply elements of each vector together
    void elementMiltiply(Vector v);

    // Calculate dot product of this vector and vector v
    double dotProduct(Vector v);

    // Calculate the cross product between this vector and vector v
    Vector crossProduct(Vector v);

}
