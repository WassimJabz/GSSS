<!-- Author Enzo Benoit-Jeannin -->

<template>
  <div>
    <h1>Purchases</h1>

    <div class="ham" v-if="this.purchases.length != 0">
      <div class="menu" v-bind:class="menu ? 'menu-open' : 'menu-closed'">
        <ul class = "selectable-list">
          <li v-for="(purchase, i) in purchases" :key="purchase.id" v-on:click="onPurchaseSelect(i)">
            {{ purchase.date }}
          </li>
        </ul>
      </div>

      <div class = "vertical-separator"/>
      <div class="details" v-bind:class="menu ? 'menu-open' : 'menu-closed'">
          <div v-if="this.selectedPurchase!=-1">
            <button class="back-button" v-on:click="menu = true">Back</button>
            <div> 
              <h2> Selected Purchase information: </h2>
            </div>
            
            <div> Customer email: {{ purchases[selectedPurchase].customer }}</div>
            <div> Order type: {{ purchases[selectedPurchase].orderType }}</div>
            <div> Order status: {{ purchases[selectedPurchase].orderStatus }}</div>
            <div> Date: {{ purchases[selectedPurchase].date }}</div>
            <div> Time: {{ purchases[selectedPurchase].time }}</div>
            <div> Employee: {{ purchases[selectedPurchase].employee.email }} </div>
            <div> Cost: {{ purchases[selectedPurchase].cost.toFixed(2) }}$</div>
            <div> Items:
                <ul v-for="(n, index) in this.selectedPurchaseItems.length" :key="index"> 
                    <li> {{ selectedPurchaseItems[index] }} : {{ selectedPurchaseQuantities[index] }} ( {{ selectedPurchaseItemsPrices[index] }}$ / unit )</li>
                </ul>
            </div>
            <br>
            <h2> Modify purchase order status: </h2>
            <select class="selector" name="Order Status" id="orderStatus" v-model="orderStatus">
              <option value="BeingPrepared">Being Prepared</option>
              <option value="OutForDelivery">Out for Delivery</option>
              <option value="Completed">Completed</option>
            </select>
            <button v-bind:disabled="!orderStatus" @click="modifyPurchaseStatus()">Modify Order Status</button>
        </div>
        
      </div>

      <div v-if="error" class="error">
        <div>
          {{ error }}
        </div>
      </div>

      <div v-if="success" class="success">
        <div>
          {{ success }}
        </div>
      </div>
    </div>
  </div>

</template>

<script src="./employeeViewPurchase.js"/>

<style scoped src="./EmployeeViewPurchase.css" />