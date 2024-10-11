package main

import "fmt"

type Carro struct {
	Marca  string
	Modelo string
	Ano    int
}

func (c Carro) imprime() {
	fmt.Println("Marca: ", c.Marca, " Modelo: ", c.Modelo, " Ano: ", c.Ano)
}

func main() {
	carro := Carro{Marca: "Audi", Modelo: "Qualquer", Ano: 2020}
	carro.imprime()
}
