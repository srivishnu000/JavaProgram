class Perimeter:{
    def __init__(self):
        pass
    
    def square_perimeter(self, s):
        return 4 * s
    
    def rectangle_perimeter(self, l, b):
        return 2 * (l + b)
    
    def circle_perimeter(self, r):
        return 2 * (22/7) * r
    
    def display_menu(self):
        print("Perimeter Calculation Menu:")
        print("1. Calculate perimeter of a square")
        print("2. Calculate perimeter of a rectangle")
        print("3. Calculate perimeter of a circle")
        print("4. Exit")
    
    def compute_perimeter(self):
        while True:
            self.display_menu()
            choice = int(input("Enter your choice (1-4): "))
            
            if choice == 1:
                side = float(input("Enter the side length of the square: "))
                print("Perimeter of the square:", self.square_perimeter(side))
            elif choice == 2:
                length = float(input("Enter the length of the rectangle: "))
                breadth = float(input("Enter the breadth of the rectangle: "))
                print("Perimeter of the rectangle:", self.rectangle_perimeter(length, breadth))
            elif choice == 3:
                radius = float(input("Enter the radius of the circle: "))
                print("Perimeter of the circle:", self.circle_perimeter(radius))
            elif choice == 4:
                print("Exiting...")
                break
            else:
                print("Invalid choice. Please enter a number between 1 and 4.")
