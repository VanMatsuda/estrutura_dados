console.log("Olá Mundo")
let nome = "Vanessa Matsuda"
let idade = 20
let altura = 1.68
let vazio

// objeto dentro sem criar uma classe = Json
let objeto = {
    "nome": "Francisco",
    "idade": 12,
    "altura": 1.75
}

let objeto2 = {
    nome,
    idade,
    altura
}

console.log(nome,idade,altura, null, false, true, vazio)
console.log(objeto)
console.log(objeto2)

//
/**/
//usando colchetes
let modelos = ['Gol','Corsa','Fusca']

//usando construtor Array()
let marcas = Array('Chevrolet','Ford','Fiat')

//definindo um valor fixo atraves da Array
let acessorios = new Array(5)

//criando um Vetor Vazio
let cores = []

//ou
let categorias = new Array()

/*console.log(modelos)
console.log(marcas)
console.log(acessorios)
console.log(cores)*/

//exibindo ou recupedando o elemento vetor

console.log(modelos[0])
console.log(modelos[1])
console.log(modelos[2])

let nome_modelo = modelos[0]
console.log(nome_modelo)

//adicionando elementos no fim da array
modelos.push('HB20')

//adicionando elementos no inicio da array
modelos.unshift('Logan')

console.log(modelos)

//removendo elementos no fim da array
modelos.shift()
console.log(modelos)

//removendo elementos no inicio da array
modelos.pop()
console.log(modelos)

//concatenar duas ou mais arrays (junta arrays)
let frutas = ['laranja','melancia','morango'] 
let vegetais = ['batata doce','cenoura','milho']
let feira = frutas.concat(vegetais)

console.log(feira)

//selecionando e copiando uma parte da array
let frutas_ = ['laranja','melancia','morango','uva', 'caju']
let frutas_sel = frutas_.slice(1,3) //elemento do 1 ao 3 (não a posição)

console.log(frutas_sel)

//alterando ou removendo elemento de array
frutas_.splice(2,2,'manga','abacaxi')

console.log(frutas_)

//transforma a array em texto, utilizar , ou espaço vazio para separar os elementos
let frutas1 =['Laranja','Melância','Morango','Uva','Caju']
let texto = frutas1.join(',')

console.log(texto)

//passa por todos os elementos e realiza a função determinada 
let numeros = [1,2,3,4,5,6]
let dobra = numeros.map(x=>x*2)

console.log(dobra)

//verifica os elementos pesquisados
let numero = [1,2,3,4,5,6]
let pares = numero.filter(x => x % 2 ==0)

console.log(pares)

//condicional como if e else, é um ternário
let nota = 6
let res = nota>=6 ? "Aprovado":"Reprovado"
console.log(res)

//localiza o elemento e posição na array
let localiza_elemento = numero.find(x=> x>2)
let localiza_index = numero.findIndex(x=>x>2)

console.log("Foi localizado o elemento: " +localiza_elemento)
console.log("Foi localizado o index: " +localiza_index)

//verifica condição logica da array true ou false
let maior = numeros.some(x=> x>)
console.log(maior)

let r = numeros.every(x=>x>0)
console.log("Todos atendem a regra: "+r)

//organizando elementos
let n_aleatorio = [10,12,05,03,01,0,06,02,08,07]
console.log(n_aleatorio)
n_aleatorio.sort()
console.log(n_aleatorio)

n_aleatorio.reverse()
console.log(n_aleatorio)


