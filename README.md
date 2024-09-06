# Conclusiones

## Desempeño Secuencial Superior:

El uso de stream secuencial resultó ser más rápido con un tiempo de 290 ms en comparación con los 407 ms del
parallelStream.

## Contexto de Uso:

parallelStream puede ser beneficioso en operaciones más complejas o donde la paralelización pueda aprovechar mejor los
recursos del sistema.
Para operaciones simples y listas grandes, stream secuencial es más eficiente.

Imagenes en la carpeta imagenes.

# Correcciones - Estado: RE-ENTREGA

## Necesarias para aprobar:

- El README.md no debería de tener la extensión .txt, ya lo renombré, pero deben incluir las imágenes de las
  conclusiones en el mismo
- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido que se pisa ya que no se renueva en cada @Test.
- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. NO utilizar
  optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les
  permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination
- En la elaboración de sus conclusiones, es fundamental que incluyan los valores obtenidos en la descripción y
  cuantifiquen los resultados con medidas específicas. Al hacer esto, sus conclusiones serán más precisas y sólidas.
  Incluir qué Modo de Benchmark utilizaron, por qué lo eligieron, análizar qué representan los resultados, cómo influye
  la tasa de errores, etc.

## Adicionales:

- Error de typo en la palabra "tareasAsinc", renombrar a "tareasAsync"