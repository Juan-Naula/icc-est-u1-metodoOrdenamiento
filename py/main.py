from sortSelection import SortSelection

def main():
    numeros = [5, 2, 9, 1, 5, 6]
    print("Estudiante: Juan Naula")
    print(f"Original: {numeros}")
    

    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print(f"Ordenado Ascendente: {numeros}")


    selection.sort_descendente(numeros)
    print(f"Ordenado Descendente: {numeros}")



if __name__=="__main__":
    main()