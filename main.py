class Animal:
    def makeSound(self):
        print("Animal makes sound")
        
class Dog(Animal):
    def makeSound(self):
        print("Dog barks")

class Cat(Animal):
    def makeSound(self):
        print("Cat meows")
        
def printInfo(animal:Animal):
    print(type(animal))
    animal.makeSound()
        
animal = Cat()
if __name__ == "__main__":
    printInfo(animal)


