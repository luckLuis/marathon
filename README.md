# Evaluación desarrollo de software Marathon

# Evaluación 

1. Crear una pantalla que permita visualizar empresas. ✔️
2. Crear una pantalla para crear empresas. (falta enviar datos desde el front end, el backend funciona correctamente)
3. Cree una pantalla para editar las empresas. (falta enviar datos desde el front end, el backend funciona correctamente)
4. Cree una pantalla que le permita visualizar los departamentos. ✔️
5. Crear una pantalla para crear departamentos. (falta enviar datos desde el front end, el backend funciona correctamente)
6. Cree una pantalla para editar los departamentos. (falta enviar datos desde el front end, el backend funciona correctamente)
7. Cree una pantalla que le permita visualizar a los empleados. ✔️
8. Crea una pantalla para crear empleados. (falta enviar datos desde el front end, el backend funciona correctamente)
9. Cree una pantalla para editar los empleados. (falta enviar datos desde el front end, el backend funciona correctamente)
10. Cree una guía de instalación para poner en producción la aplicación.
11. Código fuente para revisión. ✔️
12. Acceso al repositorio de versionado de código. ✔️
13. Documento con imágenes con evidencia de la solicitud ✔️

# Base de datos
## Creación del diagrama EER en MySql WorkBench

![image](https://github.com/luckLuis/marathon/assets/58127103/63ee4b38-0aca-4a7d-9f41-8911e7212fe3)

# BackEnd

Para la creación del backend se usarón las herramientas JAVA EE, NetBeand IDE. 

![image](https://github.com/luckLuis/marathon/assets/58127103/39a1ea0a-c8fe-4118-882e-7e580bf33556)

El backend generó un web service SOAP el cual se realizó las pruebas del funcionamiento correcto mediante la herramienta SOAP UI e ingresando datos desde la interfaz backend que nos genera.

### Servicios desarrolados

![image](https://github.com/luckLuis/marathon/assets/58127103/71d56357-9975-4093-92ef-609c8a9d10ff)

### Interfaz backend para pruebas:

![image](https://github.com/luckLuis/marathon/assets/58127103/9a71b13d-c55b-4f94-940a-21bed04e99f3)



# FrontEnd

Para la creación y consumo del web service SOAP generado por el backend se usó las herramientas JSF con el framework PrimeFaces.

![image](https://github.com/luckLuis/marathon/assets/58127103/7993eeb6-72c3-411c-8868-0b8c807f01ee)

### Conexión hacia el servicio SOAP:

![image](https://github.com/luckLuis/marathon/assets/58127103/06adc37c-e383-4af9-a485-3bc72c39ad91)

Publicación de datos obtenidos desde el servicio SOAP en una interfaz gráfica:

![image](https://github.com/luckLuis/marathon/assets/58127103/ea05c243-8584-49e3-9c65-c03384057cf9)

## Pruebas del backend

### Interfaz gráfica para las pruebas del backend

El proyecto cuenta con varios servicios que serían listar, listarEmpleados, editar, editarEmpleados, entre otros y tambien cuenta con servicios extras que son eliminar y listar por ID.

![image](https://github.com/luckLuis/marathon/assets/58127103/a94f84a4-4891-404e-88b0-af4cfaa230f9)

### Prueba de listado de empresas

Al momento de realizar esta prueba el servicio nos devuelve un XML con todos los datos obtenidos de la base de datos:

![image](https://github.com/luckLuis/marathon/assets/58127103/1a867163-d865-41c1-b879-34db3fe1f821)

![image](https://github.com/luckLuis/marathon/assets/58127103/31e22002-2edc-4554-a743-61d85dc61774)

### Prueba de crear empresa

⏩Envio de datos

![image](https://github.com/luckLuis/marathon/assets/58127103/6b984dcf-f25a-4ebe-8b7c-025cadef5839)

⏩ Mensaje de correcto funcionamiento

![image](https://github.com/luckLuis/marathon/assets/58127103/35905f60-5f76-46d3-8db4-e3988858d66d)

⏩ Comprobación en la base de datos

![image](https://github.com/luckLuis/marathon/assets/58127103/4e7418a6-fb25-4919-b64c-c7d1181bb6a0)

### Prueba de editar empresa

⏩ Se envia los datos ingresando el ID de la empresa a modificar

![image](https://github.com/luckLuis/marathon/assets/58127103/179d454b-efba-458e-963e-ecd16d40c8af)

⏩ Mensaje de editado correcto

![image](https://github.com/luckLuis/marathon/assets/58127103/5d12dcfa-e8a9-44c0-a346-e10a9a977abc)

⏩ Al realizar el cambio de los datos se actualiza automáticamente el campo fecha editada

![image](https://github.com/luckLuis/marathon/assets/58127103/b273f935-3dda-4a43-906f-7faf8a741f13)


### Prueba de crear empleados

⏩Envio de datos 

![image](https://github.com/luckLuis/marathon/assets/58127103/6c926bfe-07a4-40b6-b001-40bf4f1b2745)

⏩ Mensaje de correcto funcionamiento

![image](https://github.com/luckLuis/marathon/assets/58127103/d59bd5f0-97cf-439a-b9fa-57c1ca4ce562)

⏩ Comprobación en la base de datos

![image](https://github.com/luckLuis/marathon/assets/58127103/e2a26c6d-76c6-408e-bd23-80bce952e598)

### Prueba de editar empleado

⏩Envio de datos 

![image](https://github.com/luckLuis/marathon/assets/58127103/2b0bc808-b20d-4473-bfed-3c919c595b1c)

⏩ Mensaje de edición correcta

![image](https://github.com/luckLuis/marathon/assets/58127103/8105b791-c109-4932-b184-28b9d801915a)

⏩ Al realizar el cambio de los datos se actualiza automáticamente el campo fecha editada

![image](https://github.com/luckLuis/marathon/assets/58127103/a1c10c85-059e-4934-8484-7955f8658880)

### Prueba de crear departamento

⏩Envio de datos 

Se realiza el envío de datos, importante enviar el id de la empresa que ya exista caso contrario no se podrá crear el departamento

![image](https://github.com/luckLuis/marathon/assets/58127103/5ad68600-d541-44ae-a761-d51a41d6852a)

⏩ Mensaje de correcto funcionamiento

![image](https://github.com/luckLuis/marathon/assets/58127103/957342a0-ac3f-437a-887c-727e7385206a)

⏩ Comprobación en la base de datos

![image](https://github.com/luckLuis/marathon/assets/58127103/79e19122-f5fd-4d65-9f39-42eff0f89610)

### Prueba de editar departamento

⏩Envio de datos 

Al momento de editar un departamento se puede realizar el cambio de todo: descripción, nombre, teléfono y la empresa a la que pertecenece (enviar id de empresa ya existente)

![image](https://github.com/luckLuis/marathon/assets/58127103/abbdbd4e-195e-42cc-81fb-0b8664717c01)

⏩ Mensaje de edición correcta

![image](https://github.com/luckLuis/marathon/assets/58127103/06ad949c-f5e1-4766-aeba-671ed53f068e)

⏩ Al realizar el cambio de los datos se actualiza automáticamente el campo fecha editada

![image](https://github.com/luckLuis/marathon/assets/58127103/7ffe2ccc-5d9f-4db6-a330-e4a840c2ac13)


## Pruebas del frontend

### Datos de la tabla enterprises en la base de datos

![image](https://github.com/luckLuis/marathon/assets/58127103/f536f4ff-ebe9-444d-8254-4114589f0955)

### Datos mostrados en el frontend

![image](https://github.com/luckLuis/marathon/assets/58127103/fa08ed90-f617-4b4f-a1c4-78cd1a0fd975)

### Datos de la tabla employees en la base de datos

![image](https://github.com/luckLuis/marathon/assets/58127103/7d647619-c657-41e2-a0fa-1dc6e6775cc4)

### Datos mostrados en el frontend

![image](https://github.com/luckLuis/marathon/assets/58127103/29bc5483-7944-4ab2-95a7-46978a6f5dd1)

### Datos de la tabla departments en la base de datos

![image](https://github.com/luckLuis/marathon/assets/58127103/e8a69b71-7c68-4bc7-88d5-b496bc1554e5)

### Datos mostrados en el frontend

![image](https://github.com/luckLuis/marathon/assets/58127103/fa981a3b-a6c3-4388-8f55-c0bf93a3059d)


