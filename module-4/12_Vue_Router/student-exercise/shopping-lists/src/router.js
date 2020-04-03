import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home'
import Products from './views/Products'
import ProductsList from './views/ProductsList'
import Product from './views/Product'
import WeeklySpecials from './views/WeeklySpecials'
import ShoppingCart from './views/ShoppingCart'
import Checkout from './views/Checkout'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/products',
      name: 'products',
      component: Products
    },
    {
      path: '/products/:department',
      name: 'products-list',
      component: ProductsList
    },
    {
      path: '/products/sku/:sku',
      name: 'product',
      component: Product
    },
    {
      path: '/on-sale',
      name: 'weekly-specials',
      component: WeeklySpecials
    },
    {
      path: '/cart',
      name: 'cart',
      component: ShoppingCart
    },
    {
      path: '/checkout',
      name: 'checkout',
      component: Checkout
    }
    
  ]
})
