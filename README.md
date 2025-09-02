# Gestión de Materiales - Diagramas de Flujo

Este repositorio contiene los diagramas de flujo relacionados con el proceso de **pedido, despacho y recepción de materiales**.

## 1. Proceso de Despacho de Materiales
![Despacho de materiales](despacho_materiales.png)

### Descripción:
1. El **almacenero** recibe una orden de pedido de materiales.
2. Se verifica el **stock** de materiales disponibles.
3. Si hay stock suficiente:
   - Se arma el pedido con los materiales solicitados.
   - Se despacha la orden de pedido.
   - Se actualiza el stock de materiales.
4. Si no hay stock suficiente:
   - Se consulta si se desea solicitar materiales al almacén del cliente.
     - Si **sí**, se genera una proforma de pedido de materiales del almacén del cliente.
     - Si **no**, se genera una orden de compra de materiales faltantes.

---

## 2. Proceso de Pedido de Materiales (Coordinador)
![Pedido de materiales](pedido_materiales.png)

### Descripción:
1. El **coordinador** solicita una orden de pedido de materiales para obra.
2. Se valida si la obra se encuentra **activa**.
   - Si **sí**, se registra la orden de pedido de materiales y se genera un imprimible para control interno.
   - Si **no**, la orden es denegada.
3. En cualquier caso, se registra el historial de la solicitud.

---

## 3. Proceso de Recepción de Materiales
![Recepción de materiales](recepcion_materiales.png)

### Descripción:
1. El **almacenero** recibe el pedido de compra de materiales o pedido del almacén del cliente.
2. Se verifica si el pedido recibido está **correcto y/o sin faltantes**.
   - Si **sí**, los materiales son ingresados al almacén.
   - Si **no**, se registra como **pedido incompleto** con faltantes y/o materiales dañados.

---

## Archivos Incluidos
- `despacho_materiales.png`: Diagrama del proceso de despacho de materiales.
- `pedido_materiales.png`: Diagrama del proceso de pedido de materiales (coordinador).
- `recepcion_materiales.png`: Diagrama del proceso de recepción de materiales.

