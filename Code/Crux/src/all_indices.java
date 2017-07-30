package Java;

public class all_indices {
	
	int search(int array[], int size, int key)
	{
		int location;
		if (array[size] == key)
		{
			return size;
		}
		else if (size == -1)
		{
			return -1;
		}
		else
		{
			return (location = search(array, size - 1, key));
		}

	}


	int main()
	{
		int size, index, key;
		int list[20];
		int count = 0;
		int i;
		System.out.println("Enter the size of the list: ");
		scanf("%d", &size);
		index = size;
		System.out.println("Printing the array:");
		int [] input= { 1, 7 ,7 ,4};
		for (i = 0; i < size; i++)
		{
			list[i] = rand() % size;
			System.out.println("%d\t", list[i]);
		}
		System.out.println("\nEnter the key to search: ");
		scanf("%d", &key);
		while (index > 0)
		{
			index = search(list, index - 1, key);
			System.out.println("Key found at position: %d\n", index + 1);
			count++;
		}

		if (!count)
			System.out.println("Key not found.\n");

		return 0;
	}
}

