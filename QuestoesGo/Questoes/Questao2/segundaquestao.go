package main

import "fmt"

type Carro struct {
	Marca      string
	Modelo     string
	Ano        int
	Velocidade int
}

func (c Carro) imprime() {
	fmt.Println("Marca: ", c.Marca, " Modelo: ", c.Modelo, " Ano: ", c.Ano)
}

func (c Carro) acelerar(velocidade int) int {
	c.Velocidade += velocidade
	return c.Velocidade
}

func (c Carro) frear(velocidade int) int {
	c.Velocidade -= velocidade
	return c.Velocidade
}

func main() {
	carro := Carro{Marca: "Audi", Modelo: "Qualquer", Ano: 2020}
	carro.imprime()

	carro.acelerar(200)
	carro.frear(100)

}
