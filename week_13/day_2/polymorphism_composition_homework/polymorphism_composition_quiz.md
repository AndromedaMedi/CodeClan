# Polymorphism & Composition Homework - Quiz

# Polymorphism

1. What does the ___word___ 'polymorphism' mean?

The work 'polymorphism' means something can take many forms.

2. What does it mean when we apply polymorphism to OO design? Give a simple Java example.

In OOP specifically, 'polymorphism' is a concept that refers to a situation in which something occurs in several forms.

3. What can we use to implement polymorphism in Java?

We can implement Interfaces to access objects of different types or Inheritance.

4. How many 'forms' can an object take when using polymorphism?

It was take many forms.

5. Give an example of when you could use polymorphism.

We can have different types of animals that implement an Eat interface.


# Composition and Aggregation

6. What do we mean by 'composition' in reference to object-oriented programming?

'composition' in OOP describes a class than refers to objects of other class variables. That class is 'composed' out of other classes.

7. When would you use composition? Provide a simple example in Java.

You would use composition when one object has or is 'part of' another object.

E.g. A house has a roof, a roof is part of a house.

8. Give a difference between composition and aggregation?

Same as the above example, when one object (roof) is part of another object (house) then the relationship between them is composition.
When one object (house) 'has' another object (roof), that's Aggregation.

9. What is/are the advantage(s) of using composition/aggregation?

Achieving polymorphism through using composition instead of inheritance, can be advantageous since it's more flexible, it allows the class to change behaviour by changing included object. 
Aggregation relationship can be more semantically correct. It also increases the usability of the code.

10. When using composition, when an object is destroyed, what happens to all the objects it is composed of?

With composition, when an object is destroyed, the objects it is composed of get destroyed with it. 

11. When using aggregation, when an object is destroyed, what happens to all the objects it is composed of?

With aggregation, when an object is destroyed, the objects it is composed of remain and can be used by other objects.
